package com.example.student.fb999;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by student on 4/19/2017.
 */

public class UsersAdapter extends ArrayAdapter<User>
{
    public UsersAdapter(Context context, List<User> users)
    {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvEmail = (TextView) convertView.findViewById(R.id.tvEmail);
        // Populate the data into the template view using the data object
        tvName.setText(user.getName());
        tvEmail.setText(user.getEmail());
        // Return the completed view to render on screen
        return convertView;
    }
}
