package p069de;

import Ke.k;
import Re.E0;
import Se.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z implements InterfaceC1791e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40188a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(InterfaceC1791e interfaceC1791e, E0 typeSubstitution, g kotlinTypeRefiner) {
            k kVarF;
            Intrinsics.checkNotNullParameter(interfaceC1791e, "<this>");
            Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC1791e instanceof z ? (z) interfaceC1791e : null;
            if (zVar != null && (kVarF = zVar.F(typeSubstitution, kotlinTypeRefiner)) != null) {
                return kVarF;
            }
            k kVarN = interfaceC1791e.N(typeSubstitution);
            Intrinsics.checkNotNullExpressionValue(kVarN, "getMemberScope(...)");
            return kVarN;
        }

        public final k b(InterfaceC1791e interfaceC1791e, g kotlinTypeRefiner) {
            k kVarK0;
            Intrinsics.checkNotNullParameter(interfaceC1791e, "<this>");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            z zVar = interfaceC1791e instanceof z ? (z) interfaceC1791e : null;
            if (zVar != null && (kVarK0 = zVar.k0(kotlinTypeRefiner)) != null) {
                return kVarK0;
            }
            k kVarZ = interfaceC1791e.Z();
            Intrinsics.checkNotNullExpressionValue(kVarZ, "getUnsubstitutedMemberScope(...)");
            return kVarZ;
        }
    }

    protected abstract k F(E0 e10, g gVar);

    protected abstract k k0(g gVar);
}
