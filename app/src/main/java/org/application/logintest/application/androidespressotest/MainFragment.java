package org.application.logintest.application.androidespressotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class MainFragment extends Fragment {


    private AppCompatButton btn_login;
    private EditText et_email;
    private EditText et_password;

    public MainFragment() {
        // Required empty public constructor
    }


    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {

        btn_login = view.findViewById(R.id.btn_login);

        btn_login.setOnClickListener(login);

        et_email = view.findViewById(R.id.et_email);

        et_password = view.findViewById(R.id.et_password);

    }

    private void Login() {


    }

    private void Logout() {


    }

    private void Profile() {


    }

    private void P() {

        int a = 0;

        int aa = 1;

        int aaa = 2;



    }


    View.OnClickListener login = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            //Snackbar.make(getView(), "User Registered Successfully !", Snackbar.LENGTH_LONG).show();

            Intent intent = new Intent(getActivity(), SecondActivity.class);

            startActivity(intent);

        }
    };
}
