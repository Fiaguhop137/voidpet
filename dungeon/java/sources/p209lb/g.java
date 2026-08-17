package p209lb;

/* JADX INFO: loaded from: classes2.dex */
public class g extends a {
    public g(String str) {
        super("Module '" + str + "' not found. Are you sure all modules are linked correctly?");
    }

    @Override // p209lb.a
    public String a() {
        return "E_MODULE_NOT_FOUND";
    }
}
