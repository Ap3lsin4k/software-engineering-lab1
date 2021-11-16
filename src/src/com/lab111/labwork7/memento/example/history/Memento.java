package com.lab111.labwork7.memento.example.history;

import com.lab111.labwork7.memento.example.editor.Editor;

/**
 * Memento itself for restoring from backups, and keeping the pointer to the editor
 */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}
