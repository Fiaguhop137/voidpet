package Wc;

import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends CodedException {
    public g(String str) {
        super("An error occurred when accessing the keystore: " + (str == null ? "unknown" : str), null, 2, null);
    }
}
