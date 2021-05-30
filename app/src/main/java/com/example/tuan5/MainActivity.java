package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomerItemAdapter adt;
    private ArrayList<Item> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lsvItem);
        arrayList = new ArrayList<>();
        arrayList.add(new Item("Ca nấu lẩu, nấu mì mini...", "Shop Devang", R.drawable.ca_nau_lau));
        arrayList.add(new Item("1KG KHÔ GÀ BƠ TỎI ...", "Shop LTD Food", R.drawable.ga_bo_toi));
        arrayList.add(new Item("Xe cần cẩu đa năng", "Shop Thế giới đồ chơi", R.drawable.xa_can_cau));
        arrayList.add(new Item("Đồ chơi mô hình", "Shop Thế giới đồ chơi", R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new Item("Lãnh đạo đơn giản", "Shop Minh Long Book", R.drawable.lanh_dao_gian_don));
        arrayList.add(new Item("Hiểu lòng trẻ con", "Shop Minh Long Book", R.drawable.hieu_long_con_tre));
        arrayList.add(new Item("Donal Trump Thiên tài lãnh đạo", "Shop Minh Long Book", R.drawable.trump));

        adt = new CustomerItemAdapter(MainActivity.this, R.layout.listview_item, arrayList);
        listView.setAdapter(adt);
    }
}