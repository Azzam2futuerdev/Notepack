/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepack;

import notepack.app.domain.Notepad;

/**
 *
 * @author lg
 */
public interface NotepadCreateCallback {
    public void ready(Notepad notepad);
}
