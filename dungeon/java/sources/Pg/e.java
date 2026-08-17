package Pg;

import Pf.C1328t;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {
    static C1328t a(String str) {
        if (str.equals("SHA-256")) {
            return Rf.a.f11228c;
        }
        if (str.equals("SHA-512")) {
            return Rf.a.f11232e;
        }
        if (str.equals("SHAKE128")) {
            return Rf.a.f11248m;
        }
        if (str.equals("SHAKE256")) {
            return Rf.a.f11250n;
        }
        throw new IllegalArgumentException("unrecognized digest: " + str);
    }
}
