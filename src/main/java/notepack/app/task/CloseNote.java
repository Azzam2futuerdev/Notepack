package notepack.app.task;

import notepack.app.domain.Note;
import notepack.app.domain.Task;
import notepack.app.listener.NoteListener;

public class CloseNote implements Task,TypeNote {

    private Note note;

    public CloseNote(Note note) {
        this.note = note;
    }

    @Override
    public void backgroundWork() {
    }

    @Override
    public void notify(NoteListener listener) {
        listener.onClose(note);
    }

}
