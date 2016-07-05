package com.example.rafael.supermercado.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rafael.supermercado.Modelo.Produto;
import com.example.rafael.supermercado.R;

import java.util.List;

/**
 * Created by rafael on 29/06/16.
 */
public class pesquisaAdapter extends BaseAdapter {

    private Context context;
    private List<Produto> listaproduto;

    public pesquisaAdapter(Context context, List<Produto> lista) {
        this.context = context;
        this.listaproduto = lista;
    }

    public void setLista( List<Produto> p){
        this.listaproduto = p;
    }

    @Override
    public int getCount() {
        return listaproduto.size();
    }

    @Override
    public Object getItem(int position) {
        Produto obj = listaproduto.get(position);
        return obj;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Produto obj = listaproduto.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.activity_produto, null);

        // Atualiza o valor do Text
        TextView txtNomeProduto = (TextView) v.findViewById(R.id.txtNomeProduto);
        txtNomeProduto.setText(obj.getNome());

        TextView txtPreco = (TextView) v.findViewById(R.id.txtPreco);
        txtPreco.setText(obj.getPreco().toString());

        return v;
    }
}
