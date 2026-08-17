package expo.modules.kotlin.exception;

import Zb.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0459a f41002c = new C0459a(null);

    /* JADX INFO: renamed from: expo.modules.kotlin.exception.a$a, reason: collision with other inner class name */
    public static final class C0459a {
        private C0459a() {
        }

        public /* synthetic */ C0459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i10) {
            int i11 = i10 % 100;
            String str = "th";
            if (11 > i11 || i11 >= 14) {
                int i12 = i10 % 10;
                if (i12 == 1) {
                    str = "st";
                } else if (i12 == 2) {
                    str = "nd";
                } else if (i12 == 3) {
                    str = "rd";
                }
            }
            return i10 + str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o argDesiredType, int i10, String providedType, CodedException cause) {
        super("The " + f41002c.a(i10 + 1) + " argument cannot be cast to type " + argDesiredType + " (received " + providedType + ")", cause);
        Intrinsics.checkNotNullParameter(argDesiredType, "argDesiredType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
