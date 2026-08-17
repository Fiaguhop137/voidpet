package androidx.compose.ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p324s0.AbstractC4137f0;
import p324s0.AbstractC4146k;
import p324s0.AbstractC4148m;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21400b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f21401c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final i f21402d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i f21403e = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K.c f21404a = new K.c(new p001a0.m[16], 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a() {
            return i.f21402d;
        }

        public final i b() {
            return i.f21401c;
        }

        public final i c() {
            return i.f21403e;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21405a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f21405a = i10;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.J(this.f21405a));
        }
    }

    public static /* synthetic */ boolean f(i iVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = androidx.compose.ui.focus.b.f21373b.b();
        }
        return iVar.e(i10);
    }

    public final boolean d(Function1 function1) {
        a aVar = f21400b;
        if (this == aVar.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == aVar.a()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this.f21404a.l() == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        K.c cVar = this.f21404a;
        Object[] objArr = cVar.f5867a;
        int iL = cVar.l();
        boolean z10 = false;
        for (int i10 = 0; i10 < iL; i10++) {
            p001a0.m mVar = (p001a0.m) objArr[i10];
            int iA = AbstractC4137f0.a(1024);
            if (!mVar.k0().D1()) {
                p270p0.a.b("visitChildren called on an unattached node");
            }
            K.c cVar2 = new K.c(new V.k.c[16], 0);
            V.k.c cVarU1 = mVar.k0().u1();
            if (cVarU1 == null) {
                AbstractC4146k.c(cVar2, mVar.k0(), false);
            } else {
                cVar2.b(cVarU1);
            }
            while (cVar2.l() != 0) {
                V.k.c cVarH = (V.k.c) cVar2.r(cVar2.l() - 1);
                if ((cVarH.t1() & iA) == 0) {
                    AbstractC4146k.c(cVar2, cVarH, false);
                } else {
                    while (cVarH != null) {
                        if ((cVarH.y1() & iA) != 0) {
                            K.c cVar3 = null;
                            while (cVarH != null) {
                                if (cVarH instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) cVarH;
                                    if (focusTargetNode.b2().i() ? ((Boolean) function1.invoke(focusTargetNode)).booleanValue() : q.k(focusTargetNode, androidx.compose.ui.focus.b.f21373b.b(), function1)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if (((cVarH.y1() & iA) != 0) && (cVarH instanceof AbstractC4148m)) {
                                    int i11 = 0;
                                    for (V.k.c cVarX1 = ((AbstractC4148m) cVarH).X1(); cVarX1 != null; cVarX1 = cVarX1.u1()) {
                                        if ((cVarX1.y1() & iA) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVarH = cVarX1;
                                            } else {
                                                if (cVar3 == null) {
                                                    cVar3 = new K.c(new V.k.c[16], 0);
                                                }
                                                if (cVarH != null) {
                                                    cVar3.b(cVarH);
                                                    cVarH = null;
                                                }
                                                cVar3.b(cVarX1);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVarH = AbstractC4146k.h(cVar3);
                            }
                            break;
                        }
                        cVarH = cVarH.u1();
                    }
                }
            }
        }
        return z10;
    }

    public final boolean e(int i10) {
        return d(new b(i10));
    }
}
