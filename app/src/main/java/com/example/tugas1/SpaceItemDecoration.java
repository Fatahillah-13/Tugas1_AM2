package com.example.tugas1;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration{

    private int space;

    public SpaceItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        // Tambahkan jarak ke item (berdasarkan ruang yang didefinisikan)
        outRect.left = space;
        outRect.right = space;
        outRect.top = space;
        outRect.bottom = space;

        // Tambahkan ini jika Anda ingin jarak hanya pada item non-pertama
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = 0;
        }
    }
}
