package p073e0;

import p037c0.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f40215a;

        a(d dVar) {
            this.f40215a = dVar;
        }

        @Override // p073e0.h
        public void a(float f10, float f11, float f12, float f13, int i10) {
            this.f40215a.H().a(f10, f11, f12, f13, i10);
        }

        @Override // p073e0.h
        public void b(o0 o0Var, int i10) {
            this.f40215a.H().b(o0Var, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h b(d dVar) {
        return new a(dVar);
    }
}
