package com.margelo.nitro.utils;

import android.hardware.HardwareBuffer;
import androidx.annotation.Keep;
import com.margelo.nitro.core.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p276p6.a;

/* JADX INFO: loaded from: classes2.dex */
@a
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/margelo/nitro/utils/HardwareBufferUtils;", "", "<init>", "()V", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HardwareBufferUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.margelo.nitro.utils.HardwareBufferUtils$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Object b(Object obj) {
            return HardwareBufferUtils.copyHardwareBuffer(obj);
        }

        public final HardwareBuffer a(HardwareBuffer hardwareBuffer) {
            Intrinsics.checkNotNullParameter(hardwareBuffer, "hardwareBuffer");
            Object objB = b(hardwareBuffer);
            Intrinsics.d(objB, "null cannot be cast to non-null type android.hardware.HardwareBuffer");
            return b.a(objB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native Object copyHardwareBuffer(Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void copyHardwareBuffer(Object obj, Object obj2);
}
