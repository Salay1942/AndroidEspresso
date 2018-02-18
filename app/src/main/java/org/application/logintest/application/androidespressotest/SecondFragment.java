package org.application.logintest.application.androidespressotest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class SecondFragment extends Fragment {


    private AppCompatButton btn_chg_password;
    private AppCompatButton btn_logout;
    private EditText et_first_name;
    private EditText et_last_name;
    private EditText et_address;

    public final static String ORDER_LIST = "order_list";
    public final static String DELIVERY_INFO = "deliver_to";

    public SecondFragment() {
        // Required empty public constructor
    }

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        initViews(view);
        return view;
    }

    public static Intent createIntent(Context context, String str) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra(ORDER_LIST, "12");
        intent.putExtra(DELIVERY_INFO, "13");
        return intent;
    }

    private void initViews(View view) {

        btn_chg_password = view.findViewById(R.id.btn_chg_password);

        et_first_name = view.findViewById(R.id.et_first_name);

        et_last_name = view.findViewById(R.id.et_last_name);

        et_address = view.findViewById(R.id.et_address);

        btn_chg_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(getView(), "User Registered Successfully !", Snackbar.LENGTH_LONG).show();

            }
        });
    }

}
