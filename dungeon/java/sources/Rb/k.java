package Rb;

import android.util.Log;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10944a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f10945b = Ad.j.b(new j());

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a() {
            return (t) k.f10945b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t c() {
        try {
            Object objNewInstance = p048cb.d.class.getConstructor(null).newInstance(null);
            Intrinsics.d(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
            return (t) objNewInstance;
        } catch (Exception e10) {
            Log.e("ExpoModulesHelper", "Couldn't get expo modules list.", e10);
            return null;
        }
    }
}
