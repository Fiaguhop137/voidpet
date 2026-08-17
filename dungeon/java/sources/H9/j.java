package H9;

import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j extends Exception {
    protected j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        r.g(str, "Detail message must not be empty");
    }
}
