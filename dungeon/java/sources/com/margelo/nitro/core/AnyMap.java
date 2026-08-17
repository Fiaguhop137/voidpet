package com.margelo.nitro.core;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 N2\u00020\u0001:\u0001OB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0015J\u001b\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010H\u0087 ¢\u0006\u0004\b\"\u0010\u0003J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0#H\u0086 ¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b&\u0010\u001fJ\u0018\u0010'\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b'\u0010\u001fJ\u0018\u0010(\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b(\u0010\u001fJ\u0018\u0010)\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b)\u0010\u001fJ\u0018\u0010*\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b*\u0010\u001fJ\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b+\u0010\u001fJ\u0018\u0010,\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b,\u0010\u001fJ\u0018\u0010.\u001a\u00020-2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b0\u0010\u001fJ\u0018\u00102\u001a\u0002012\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086 ¢\u0006\u0004\b4\u00105J\"\u00107\u001a\f\u0012\u0004\u0012\u00020\f0#j\u0002`62\u0006\u0010\u000b\u001a\u00020\nH\u0086 ¢\u0006\u0004\b7\u00108J(\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0016j\u0002`92\u0006\u0010\u000b\u001a\u00020\nH\u0086 ¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0087 ¢\u0006\u0004\b<\u0010!J \u0010=\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020-H\u0087 ¢\u0006\u0004\b=\u0010>J \u0010?\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u001dH\u0087 ¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u000201H\u0087 ¢\u0006\u0004\bA\u0010BJ \u0010C\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0087 ¢\u0006\u0004\bC\u0010DJ*\u0010E\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\f0#j\u0002`6H\u0086 ¢\u0006\u0004\bE\u0010FJ0\u0010G\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0016j\u0002`9H\u0086 ¢\u0006\u0004\bG\u0010HJ\u0018\u0010J\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0000H\u0086 ¢\u0006\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/margelo/nitro/core/AnyMap;", "", "<init>", "()V", "", "preallocatedSize", "(I)V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "", "key", "Lcom/margelo/nitro/core/AnyValue;", "getAnyValue", "(Ljava/lang/String;)Lcom/margelo/nitro/core/AnyValue;", "value", "", "setAnyValue", "(Ljava/lang/String;Lcom/margelo/nitro/core/AnyValue;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "(I)Lcom/facebook/jni/HybridData;", "", "toMap", "()Ljava/util/Map;", "setAny", "(Ljava/lang/String;Ljava/lang/Object;)V", "getAny", "(Ljava/lang/String;)Ljava/lang/Object;", "", "contains", "(Ljava/lang/String;)Z", "remove", "(Ljava/lang/String;)V", "clear", "", "getAllKeys", "()[Ljava/lang/String;", "isNull", "isDouble", "isBoolean", "isBigInt", "isString", "isArray", "isObject", "", "getDouble", "(Ljava/lang/String;)D", "getBoolean", "", "getBigInt", "(Ljava/lang/String;)J", "getString", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/margelo/nitro/core/AnyArray;", "getAnyArray", "(Ljava/lang/String;)[Lcom/margelo/nitro/core/AnyValue;", "Lcom/margelo/nitro/core/AnyObject;", "getAnyObject", "(Ljava/lang/String;)Ljava/util/Map;", "setNull", "setDouble", "(Ljava/lang/String;D)V", "setBoolean", "(Ljava/lang/String;Z)V", "setBigInt", "(Ljava/lang/String;J)V", "setString", "(Ljava/lang/String;Ljava/lang/String;)V", "setAnyArray", "(Ljava/lang/String;[Lcom/margelo/nitro/core/AnyValue;)V", "setAnyObject", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "merge", "(Lcom/margelo/nitro/core/AnyMap;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnyMap {

    @NotNull
    private final HybridData mHybridData;

    public AnyMap() {
        this.mHybridData = initHybrid();
    }

    public AnyMap(int i10) {
        this.mHybridData = initHybrid(i10);
    }

    private AnyMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private final native AnyValue getAnyValue(String key);

    private final native HybridData initHybrid();

    private final native HybridData initHybrid(int preallocatedSize);

    private final native void setAnyValue(String key, AnyValue value);

    @FastNative
    public final native void clear();

    @FastNative
    public final native boolean contains(@NotNull String key);

    @NotNull
    public final native String[] getAllKeys();

    @Nullable
    public final Object getAny(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getAnyValue(key).toAny();
    }

    @NotNull
    public final native AnyValue[] getAnyArray(@NotNull String key);

    @NotNull
    public final native Map<String, AnyValue> getAnyObject(@NotNull String key);

    @FastNative
    public final native long getBigInt(@NotNull String key);

    @FastNative
    public final native boolean getBoolean(@NotNull String key);

    @FastNative
    public final native double getDouble(@NotNull String key);

    @NotNull
    public final native String getString(@NotNull String key);

    @FastNative
    public final native boolean isArray(@NotNull String key);

    @FastNative
    public final native boolean isBigInt(@NotNull String key);

    @FastNative
    public final native boolean isBoolean(@NotNull String key);

    @FastNative
    public final native boolean isDouble(@NotNull String key);

    @FastNative
    public final native boolean isNull(@NotNull String key);

    @FastNative
    public final native boolean isObject(@NotNull String key);

    @FastNative
    public final native boolean isString(@NotNull String key);

    public final native void merge(@NotNull AnyMap other);

    @FastNative
    public final native void remove(@NotNull String key);

    public final void setAny(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        setAnyValue(key, AnyValue.INSTANCE.a(value));
    }

    public final native void setAnyArray(@NotNull String key, @NotNull AnyValue[] value);

    public final native void setAnyObject(@NotNull String key, @NotNull Map<String, AnyValue> value);

    @FastNative
    public final native void setBigInt(@NotNull String key, long value);

    @FastNative
    public final native void setBoolean(@NotNull String key, boolean value);

    @FastNative
    public final native void setDouble(@NotNull String key, double value);

    @FastNative
    public final native void setNull(@NotNull String key);

    @FastNative
    public final native void setString(@NotNull String key, @NotNull String value);

    @NotNull
    public final Map<String, Object> toMap() {
        HashMap map = new HashMap();
        for (String str : getAllKeys()) {
            map.put(str, getAny(str));
        }
        return map;
    }
}
