package com.example.student.express;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class AllProductAdapter extends RecyclerView.Adapter<AllProductAdapter.ProductViewHolder> implements Filterable {

    private final Context context;
    private final List<Product> list;
    private final boolean store;
    private List<Product> listSearch;

    public AllProductAdapter(final Context context, final List<Product> list, final boolean store) {
        this.context = context;
        this.list = list;
        this.store = store;
        this.listSearch = list;
    }


    @Override
    public AllProductAdapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.all_product_item, parent, false);
        if (store) {
            view = LayoutInflater.from(context).inflate(R.layout.layout_store_item, parent, false);

        }


        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AllProductAdapter.ProductViewHolder holder, final int position) {

        final Product product = listSearch.get(position);
        holder.imageProduct.setImageResource(product.getImageArrayId()[0]);
        holder.title.setText(product.getTitle());
        holder.descr.setText(product.getDescription());
        if (!store) {
            holder.price.setText(product.getPrice() + "$");
        }
        holder.favouriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (product.isFavourite()) {
                    AllProductFragment.getList().get(position).setFavourite(false);
                    holder.favouriteButton.setColorFilter(context.getResources().getColor(R.color.colorPassive));
                } else {
                    DataProvider.getList().get(position).setFavourite(true);
                    holder.favouriteButton.setColorFilter(context.getResources().getColor(R.color.colorAccent));
                    Toast.makeText(context, String.valueOf(listSearch.size()), Toast.LENGTH_SHORT).show();
                }
            }
        });
        if (store) {
            holder.ratingBar.setRating(product.getStar());
        }
        //todo
        holder.storeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (product.isStore()) {
                    AllProductFragment.getList().get(position).setStore(false);
                    holder.storeButton.setColorFilter(context.getResources().getColor(R.color.colorPassive));
                } else {
                    DataProvider.getList().get(position).setStore(true);
                    holder.storeButton.setColorFilter(context.getResources().getColor(R.color.colorAccent));
                }
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(holder.itemView.getContext(), InfoActivity.class);
                intent.putExtra("KEY", position);
                context.startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return listSearch.size();

    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String searchText = String.valueOf(charSequence);
                if (searchText.isEmpty()) {
                    listSearch = list;
                } else {
                    List<Product> newList = new ArrayList<>();
                    for (int i = 0; i < listSearch.size(); i++) {
                        if (listSearch.get(i).getTitle().contains(searchText)) {
                            newList.add(listSearch.get(i));
                        }
                    }
                    listSearch = newList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = listSearch;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                listSearch = (List<Product>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imageProduct;
        TextView title;
        TextView descr;
        TextView price;
        ImageButton storeButton;
        ImageButton favouriteButton;
        RatingBar ratingBar;

        ProductViewHolder(View itemView) {
            super(itemView);
            imageProduct = itemView.findViewById(R.id.product_photo);
            title = itemView.findViewById(R.id.product_name);
            descr = itemView.findViewById(R.id.product_description);
            price = itemView.findViewById(R.id.product_price);
            favouriteButton = itemView.findViewById(R.id.favorite_item);
            storeButton = itemView.findViewById(R.id.store_item);
            if (store) {
                imageProduct = itemView.findViewById(R.id.product_store_photo);
                title = itemView.findViewById(R.id.product_store_name);
                descr = itemView.findViewById(R.id.product_store_description);
                favouriteButton = itemView.findViewById(R.id.favorite_store_item);
                storeButton = itemView.findViewById(R.id.store_store_item);
            }
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
