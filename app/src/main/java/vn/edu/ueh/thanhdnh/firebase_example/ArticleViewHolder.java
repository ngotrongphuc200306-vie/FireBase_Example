package vn.edu.ueh.thanhdnh.firebase_example;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
  private final TextView txtTitle, txtDesc;
  private final Button btnDelete;

  public ArticleViewHolder(@NonNull View itemView) {
    super(itemView);
    txtTitle = itemView.findViewById(R.id.txt_title);
    txtDesc = itemView.findViewById(R.id.txt_desc);
    btnDelete = itemView.findViewById(R.id.btn_delete);
  }

  public TextView getTxtTitle() {
    return txtTitle;
  }

  public TextView getTxtDesc() {
    return txtDesc;
  }

  public Button getBtnDelete() {
    return btnDelete;
  }
}