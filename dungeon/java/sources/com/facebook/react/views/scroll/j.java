package com.facebook.react.views.scroll;

import Ad.v;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.H;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f30906a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollTo(obj, new c(Math.round(H.h(readableArray.getDouble(0))), Math.round(H.h(readableArray.getDouble(1))), readableArray.getBoolean(2)));
        }

        private final void e(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollToEnd(obj, new d(readableArray.getBoolean(0)));
        }

        public final Map a() {
            return N.k(v.a("scrollTo", 1), v.a("scrollToEnd", 2), v.a("flashScrollIndicators", 3));
        }

        public final void b(b viewManager, Object obj, int i10, ReadableArray readableArray) {
            Intrinsics.checkNotNullParameter(viewManager, "viewManager");
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (i10 == 1) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, obj, readableArray);
                return;
            }
            if (i10 == 2) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                e(viewManager, obj, readableArray);
            } else {
                if (i10 == 3) {
                    viewManager.flashScrollIndicators(obj);
                    return;
                }
                throw new IllegalArgumentException("Unsupported command " + i10 + " received by " + viewManager.getClass().getSimpleName() + ".");
            }
        }

        public final void c(b viewManager, Object obj, String commandType, ReadableArray readableArray) {
            Intrinsics.checkNotNullParameter(viewManager, "viewManager");
            Intrinsics.checkNotNullParameter(commandType, "commandType");
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iHashCode = commandType.hashCode();
            if (iHashCode != -402165208) {
                if (iHashCode != 28425985) {
                    if (iHashCode == 2055114131 && commandType.equals("scrollToEnd")) {
                        if (readableArray == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        e(viewManager, obj, readableArray);
                        return;
                    }
                } else if (commandType.equals("flashScrollIndicators")) {
                    viewManager.flashScrollIndicators(obj);
                    return;
                }
            } else if (commandType.equals("scrollTo")) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, obj, readableArray);
                return;
            }
            throw new IllegalArgumentException("Unsupported command " + commandType + " received by " + viewManager.getClass().getSimpleName() + ".");
        }
    }

    public interface b {
        void flashScrollIndicators(Object obj);

        void scrollTo(Object obj, c cVar);

        void scrollToEnd(Object obj, d dVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f30907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f30909c;

        public c(int i10, int i11, boolean z10) {
            this.f30907a = i10;
            this.f30908b = i11;
            this.f30909c = z10;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f30910a;

        public d(boolean z10) {
            this.f30910a = z10;
        }
    }
}
