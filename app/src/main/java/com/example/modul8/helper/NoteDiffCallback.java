package com.example.modul8.helper;

import androidx.recyclerview.widget.DiffUtil;

import com.example.modul8.database.Note;

import java.util.List;

public class NoteDiffCallback extends DiffUtil.Callback {
    public final List<Note> mOldNotelist;
    public final List<Note> mNewNotelist;

    public NoteDiffCallback(List<Note> oldNoteList, List<Note> newNoteList) {
        mOldNotelist = oldNoteList;
        mNewNotelist = newNoteList;
    }

    @Override
    public int getOldListSize() {
        return mOldNotelist.size();
    }

    @Override
    public int getNewListSize() {
        return mNewNotelist.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return mOldNotelist.get(oldItemPosition).getId() == mNewNotelist.get(newItemPosition).getId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        final Note oldEmployee = mOldNotelist.get(oldItemPosition);
        final Note newEmployee = mOldNotelist.get(newItemPosition);

        return oldEmployee.getTitle().equals(newEmployee.getTitle()) && oldEmployee.getDescription().equals(newEmployee.getDescription());
    }
}
