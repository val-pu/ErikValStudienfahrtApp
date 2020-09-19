package valmx.nelly.studienfahrtapp.ui.home;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

import valmx.nelly.studienfahrtapp.R;
import valmx.nelly.studienfahrtapp.containers.Card;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        RecyclerView recyclerView = root.findViewById(R.id.mainCards);

        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext()));

        LinkedList<Card> cards = new LinkedList<>();

        cards.add(new Card("Museum","Dresden, HausAllee","16:00 - 17:40",1 + "","Museum", true));
        cards.add(new Card("Freizeit","Dresden, HausAllee","17:40 - 19:00",1 + "","Freizeit", false));
        cards.add(new Card("Museum","Dresden, HausAllee","20:00 - 21:00",1 + "","Abendessen", false));

        recyclerView.setAdapter(new HomeItemAdapter(cards,LayoutInflater.from(root.getContext())));

        return root;
    }
}