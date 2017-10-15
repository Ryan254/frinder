package com.frinder.frinder.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.frinder.frinder.R;
import com.frinder.frinder.model.Request;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SentRequestAdapter extends RequestsAdapter {

    public SentRequestAdapter(Context context, List<Request> requests) {
        super(context, requests);
    }

    String getUserId(Request request) {
        return request.receiverId;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View requestView = inflater.inflate(R.layout.item_request_sent, parent, false);

        // Return a new holder instance
        SentViewHolder viewHolder = new SentViewHolder(requestView);
        return viewHolder;
    }

    public class SentViewHolder extends RequestsAdapter.ViewHolder {

        @BindView(R.id.tvDelete)
        TextView tvDelete;

        public SentViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}
