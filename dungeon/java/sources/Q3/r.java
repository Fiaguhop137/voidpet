package Q3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
final class r implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9358a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public r(s sVar) {
    }

    @Override // Q3.m
    public boolean a() {
        return i.f9346a.b(null);
    }

    @Override // Q3.m
    public boolean b(L3.f fVar) {
        L3.a aVarB = fVar.b();
        if ((aVarB instanceof L3.a.C0117a ? ((L3.a.C0117a) aVarB).f() : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        L3.a aVarA = fVar.a();
        return (aVarA instanceof L3.a.C0117a ? ((L3.a.C0117a) aVarA).f() : Integer.MAX_VALUE) > 100;
    }
}
