package com.example.tugas1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private List<Student> studentList;
    private Context context;

    public StudentAdapter(Context context, List<Student> studentList) {
        this.context = context;
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = studentList.get(position);

        holder.studentName.setText(student.getName());
        holder.studentNim.setText(student.getNim());

        // Load image using Glide
        Glide.with(context)
                .load(student.getImageUrl())
                .into(holder.studentImage);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView studentImage;
        TextView studentName;
        TextView studentNim;

        public ViewHolder(View itemView) {
            super(itemView);
            studentImage = itemView.findViewById(R.id.student_image);
            studentName = itemView.findViewById(R.id.student_name);
            studentNim = itemView.findViewById(R.id.student_nim);
        }
    }
}