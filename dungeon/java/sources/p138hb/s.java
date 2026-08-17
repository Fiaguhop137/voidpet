package p138hb;

import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends CodedException {
    public s() {
        super("Setting current audio input is not supported on devices running Android version lower than Android 9.0", null, 2, null);
    }
}
