package Lb;

import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends CodedException {
    public b(String str, Exception exc) {
        super("Cannot decode provided thumbhash '" + str + "' " + exc, null, 2, null);
    }
}
