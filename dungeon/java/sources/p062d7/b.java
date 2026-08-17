package p062d7;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39832g = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39826a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final b a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            switch (name.hashCode()) {
                case -1267206133:
                    if (name.equals("opacity")) {
                        return b.OPACITY;
                    }
                    break;
                case -908189618:
                    if (name.equals("scaleX")) {
                        return b.SCALE_X;
                    }
                    break;
                case -908189617:
                    if (name.equals("scaleY")) {
                        return b.SCALE_Y;
                    }
                    break;
                case 1910893003:
                    if (name.equals("scaleXY")) {
                        return b.SCALE_XY;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported animated property: " + name);
        }
    }
}
