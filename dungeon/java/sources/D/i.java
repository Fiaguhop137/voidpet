package D;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(int i10, int i11) {
        if (!(i10 > 0 && i11 > 0)) {
            p449z.a.a("both minLines " + i10 + " and maxLines " + i11 + " must be greater than zero");
        }
        if (i10 <= i11) {
            return;
        }
        p449z.a.a("minLines " + i10 + " must be less than or equal to maxLines " + i11);
    }
}
