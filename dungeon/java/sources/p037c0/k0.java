package p037c0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019b0.g;
import p019b0.i;
import p019b0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    public static final class a extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o0 f26720a;

        public a(o0 o0Var) {
            super(null);
            this.f26720a = o0Var;
        }

        @Override // p037c0.k0
        public g a() {
            return this.f26720a.getBounds();
        }

        public final o0 b() {
            return this.f26720a;
        }
    }

    public static final class b extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g f26721a;

        public b(g gVar) {
            super(null);
            this.f26721a = gVar;
        }

        @Override // p037c0.k0
        public g a() {
            return this.f26721a;
        }

        public final g b() {
            return this.f26721a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.b(this.f26721a, ((b) obj).f26721a);
        }

        public int hashCode() {
            return this.f26721a.hashCode();
        }
    }

    public static final class c extends k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f26722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o0 f26723b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i iVar) {
            super(null);
            o0 o0Var = null;
            this.f26722a = iVar;
            if (!j.e(iVar)) {
                o0 o0VarA = M.a();
                o0.c(o0VarA, iVar, null, 2, null);
                o0Var = o0VarA;
            }
            this.f26723b = o0Var;
        }

        @Override // p037c0.k0
        public g a() {
            return j.d(this.f26722a);
        }

        public final i b() {
            return this.f26722a;
        }

        public final o0 c() {
            return this.f26723b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.b(this.f26722a, ((c) obj).f26722a);
        }

        public int hashCode() {
            return this.f26722a.hashCode();
        }
    }

    private k0() {
    }

    public /* synthetic */ k0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract g a();
}
