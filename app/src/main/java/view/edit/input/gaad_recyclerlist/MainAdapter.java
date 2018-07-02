package view.edit.input.gaad_recyclerlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hp on 6/29/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private List<UserData> moviesList;
    private View.OnClickListener onClickListener;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public RelativeLayout relativeLayout;
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);

            relativeLayout = view.findViewById(R.id.full_con);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);

            relativeLayout.setOnClickListener(onClickListener);
            title.setOnClickListener(onClickListener);
        }
    }


    public MainAdapter(List<UserData> moviesList, View.OnClickListener onClickListener) {
        this.moviesList = moviesList;
        this.onClickListener = onClickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        UserData userData = moviesList.get(position);
        holder.title.setText(userData.getName());
        holder.genre.setText(userData.getPhoneNumber());

        holder.title.setTag(userData.getName());
        holder.relativeLayout.setTag(userData.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}