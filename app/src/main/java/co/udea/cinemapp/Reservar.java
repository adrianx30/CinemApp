package co.udea.cinemapp;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Reservar extends AppCompatActivity {

    GridView myGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar);

        myGrid = (GridView) findViewById(R.id.gridView);
        myGrid.setAdapter(new VivzAdapter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reservar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


class Chair
{
    int imageId;
    String chairName;

    Chair(int imageId, String chairName)
    {
        this.imageId = imageId;
        this.chairName = chairName;
    }
}

class VivzAdapter extends BaseAdapter
{
    ArrayList<Chair> list;
    Context context;

    VivzAdapter(Context context){
        this.context = context;
        list = new ArrayList<Chair>();
        Resources res = context.getResources();
        int chairImage = (R.drawable.chair);
        for (int i=0; i<200;i++)
        {
            String tempChairName = ("Ch: "+i);
            Chair tempChair = new Chair(chairImage,tempChairName);
            list.add(tempChair);

        }
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class ViewHolder
    {
        ImageView myChair;
        ViewHolder(View v){
            myChair = (ImageView) v.findViewById(R.id.imageView);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        ViewHolder holder = null;
        if (row == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.simple_item,parent,false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) row.getTag();
        }
        Chair temp =list.get(position);
        holder.myChair.setImageResource(temp.imageId);
        return row;
    }
}
