package p138hb;

import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends CodedException {
    public m() {
        super("AudioRecorder has already been prepared. Stop or release the current session before preparing again.", null, 2, null);
    }
}
