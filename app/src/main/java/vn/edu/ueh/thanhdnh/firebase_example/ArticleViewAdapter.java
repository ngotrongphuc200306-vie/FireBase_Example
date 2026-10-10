package vn.edu.ueh.thanhdnh.firebase_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArticleViewAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
  public interface OnDeleteClickListener {
    void onDeleteClick(Article article);
  }

  private final LayoutInflater mInflater;
  private List<Article> articles;
  private final OnDeleteClickListener deleteClickListener;

  public ArticleViewAdapter(Context context, List<Article> articles, OnDeleteClickListener deleteClickListener) {
    this.mInflater = LayoutInflater.from(context);
    this.articles = articles;
    this.deleteClickListener = deleteClickListener;
  }

  public void update(List<Article> articles) {
    this.articles = articles;
  }

  @NonNull
  @Override
  public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View customView = mInflater.inflate(R.layout.article_list, parent, false);
    return new ArticleViewHolder(customView);
  }

  @Override
  public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
    Article article = articles.get(position);
    holder.getTxtTitle().setText(article.getTitle());
    holder.getTxtDesc().setText(article.getShortDesc());
    holder.getBtnDelete().setOnClickListener(v -> {
      if (deleteClickListener != null) {
        deleteClickListener.onDeleteClick(article);
      }
    });
  }

  @Override
  public int getItemCount() {
    return articles.size();
  }
}