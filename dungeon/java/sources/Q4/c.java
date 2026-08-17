package Q4;

/* JADX INFO: loaded from: classes.dex */
public class c implements j {

    class a implements i {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f.a aVar, f.a aVar2) {
            long jB = aVar.b();
            long jB2 = aVar2.b();
            if (jB < jB2) {
                return -1;
            }
            return jB2 == jB ? 0 : 1;
        }
    }

    @Override // Q4.j
    public i get() {
        return new a();
    }
}
