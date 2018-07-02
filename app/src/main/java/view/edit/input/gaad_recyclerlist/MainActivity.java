package view.edit.input.gaad_recyclerlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private List<UserData> userDataList = new ArrayList<>();
    private MainAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MainAdapter(userDataList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Random random = new Random();
        String[] name = {"MIMO", "SKP", "NITU", "ARMAN"};

        for (int i = 0; i < name.length; i++) {
            UserData userData = new UserData().setName(name[i])
                    .setUserType(random.nextInt(2))
                    .setPhoneNumber("" + random.nextInt());

            userDataList.add(userData);
        }

        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title:
                Toast.makeText(this, view.getTag() + "", Toast.LENGTH_SHORT).show();
                break;

            case R.id.full_con:
                Toast.makeText(this, view.getTag() + "", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
