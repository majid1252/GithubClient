package com.example.githubClient.data.adapter

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter

class LoadStateFooterAdapter :
    LoadStateAdapter<ReposLoadStateViewHolder>() {
    override fun onBindViewHolder(holder: ReposLoadStateViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ): ReposLoadStateViewHolder {
        return ReposLoadStateViewHolder.create(parent)
    }
}