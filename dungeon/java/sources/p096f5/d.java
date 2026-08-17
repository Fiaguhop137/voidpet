package p096f5;

import V4.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f41757a;

        a(Throwable th) {
            this.f41757a = th;
        }

        @Override // V4.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c get() {
            return d.b(this.f41757a);
        }
    }

    public static n a(Throwable th) {
        return new a(th);
    }

    public static c b(Throwable th) {
        i iVarX = i.x();
        iVarX.p(th);
        return iVarX;
    }
}
