package com.margelo.nitro.core;

import Ad.v;
import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dalvik.annotation.optimization.FastNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@p276p6.a
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 42\u00020\u0001:\u00015B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0013\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0002\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\f¢\u0006\u0004\b\u0002\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u000e¢\u0006\u0004\b\u0002\u0010\u000fB\u001b\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00000\u0010j\u0002`\u0011¢\u0006\u0004\b\u0002\u0010\u0012B!\b\u0016\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\u0013j\u0002`\u0014¢\u0006\u0004\b\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\nH\u0082 ¢\u0006\u0004\b\u0016\u0010\u0019J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u0016\u0010\u001aJ\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0016\u0010\u001bJ\"\u0010\u0016\u001a\u00020\u00042\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00000\u0010j\u0002`\u0011H\u0082 ¢\u0006\u0004\b\u0016\u0010\u001cJ(\u0010\u0016\u001a\u00020\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\u0013j\u0002`\u0014H\u0082 ¢\u0006\u0004\b\u0016\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nH\u0087 ¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\nH\u0087 ¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\nH\u0087 ¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\nH\u0087 ¢\u0006\u0004\b#\u0010\u001fJ\u0010\u0010$\u001a\u00020\nH\u0087 ¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\nH\u0087 ¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\u0007H\u0087 ¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nH\u0087 ¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\fH\u0087 ¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\f\u0012\u0004\u0012\u00020\u00000\u0010j\u0002`\u0011H\u0086 ¢\u0006\u0004\b-\u0010.J \u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00000\u0013j\u0002`\u0014H\u0086 ¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103¨\u00066"}, d2 = {"Lcom/margelo/nitro/core/AnyValue;", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "mHybridData", "(Lcom/facebook/jni/HybridData;)V", "", "value", "(D)V", "", "(Z)V", "", "(J)V", "", "(Ljava/lang/String;)V", "", "Lcom/margelo/nitro/core/AnyArray;", "([Lcom/margelo/nitro/core/AnyValue;)V", "", "Lcom/margelo/nitro/core/AnyObject;", "(Ljava/util/Map;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "(D)Lcom/facebook/jni/HybridData;", "(Z)Lcom/facebook/jni/HybridData;", "(J)Lcom/facebook/jni/HybridData;", "(Ljava/lang/String;)Lcom/facebook/jni/HybridData;", "([Lcom/margelo/nitro/core/AnyValue;)Lcom/facebook/jni/HybridData;", "(Ljava/util/Map;)Lcom/facebook/jni/HybridData;", "isNull", "()Z", "isDouble", "isBoolean", "isBigInt", "isString", "isAnyArray", "isAnyObject", "asDouble", "()D", "asBoolean", "asBigInt", "()J", "asString", "()Ljava/lang/String;", "asAnyArray", "()[Lcom/margelo/nitro/core/AnyValue;", "asAnyObject", "()Ljava/util/Map;", "toAny", "()Ljava/lang/Object;", "Lcom/facebook/jni/HybridData;", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnyValue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final HybridData mHybridData;

    /* JADX INFO: renamed from: com.margelo.nitro.core.AnyValue$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnyValue a(Object obj) {
            if (obj == null) {
                return new AnyValue();
            }
            if (obj instanceof Double) {
                return new AnyValue(((Number) obj).doubleValue());
            }
            if (obj instanceof Float) {
                return new AnyValue(((Number) obj).floatValue());
            }
            if (obj instanceof Integer) {
                return new AnyValue(((Number) obj).intValue());
            }
            if (obj instanceof Boolean) {
                return new AnyValue(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Long) {
                return new AnyValue(((Number) obj).longValue());
            }
            if (obj instanceof String) {
                return new AnyValue((String) obj);
            }
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add(AnyValue.INSTANCE.a(obj2));
                }
                return new AnyValue((AnyValue[]) arrayList.toArray(new AnyValue[0]));
            }
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.w(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(AnyValue.INSTANCE.a(it.next()));
                }
                return new AnyValue((AnyValue[]) arrayList2.toArray(new AnyValue[0]));
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                ArrayList arrayList3 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList3.add(v.a(String.valueOf(entry.getKey()), AnyValue.INSTANCE.a(entry.getValue())));
                }
                return new AnyValue((Map<String, AnyValue>) N.r(arrayList3));
            }
            if ((obj instanceof AnyValue) || (obj instanceof AnyMap)) {
                throw new Error("Cannot box AnyValue (" + obj + ") twice!");
            }
            throw new Error("Value \"" + obj + "\" cannot be represented as AnyValue!");
        }
    }

    public AnyValue() {
        this.mHybridData = initHybrid();
    }

    public AnyValue(double d10) {
        this.mHybridData = initHybrid(d10);
    }

    public AnyValue(long j10) {
        this.mHybridData = initHybrid(j10);
    }

    @p276p6.a
    @Keep
    private AnyValue(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public AnyValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mHybridData = initHybrid(value);
    }

    public AnyValue(@NotNull Map<String, AnyValue> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mHybridData = initHybrid(value);
    }

    public AnyValue(boolean z10) {
        this.mHybridData = initHybrid(z10);
    }

    public AnyValue(@NotNull AnyValue[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mHybridData = initHybrid(value);
    }

    private final native HybridData initHybrid();

    private final native HybridData initHybrid(double value);

    private final native HybridData initHybrid(long value);

    private final native HybridData initHybrid(String value);

    private final native HybridData initHybrid(Map<String, AnyValue> value);

    private final native HybridData initHybrid(boolean value);

    private final native HybridData initHybrid(AnyValue[] value);

    @NotNull
    public final native AnyValue[] asAnyArray();

    @NotNull
    public final native Map<String, AnyValue> asAnyObject();

    @FastNative
    public final native long asBigInt();

    @FastNative
    public final native boolean asBoolean();

    @FastNative
    public final native double asDouble();

    @NotNull
    public final native String asString();

    @FastNative
    public final native boolean isAnyArray();

    @FastNative
    public final native boolean isAnyObject();

    @FastNative
    public final native boolean isBigInt();

    @FastNative
    public final native boolean isBoolean();

    @FastNative
    public final native boolean isDouble();

    @FastNative
    public final native boolean isNull();

    @FastNative
    public final native boolean isString();

    @Nullable
    public final Object toAny() {
        if (isNull()) {
            return null;
        }
        if (isDouble()) {
            return Double.valueOf(asDouble());
        }
        if (isBigInt()) {
            return Long.valueOf(asBigInt());
        }
        if (isBoolean()) {
            return Boolean.valueOf(asBoolean());
        }
        if (isString()) {
            return asString();
        }
        if (isAnyArray()) {
            AnyValue[] anyValueArrAsAnyArray = asAnyArray();
            ArrayList arrayList = new ArrayList(anyValueArrAsAnyArray.length);
            for (AnyValue anyValue : anyValueArrAsAnyArray) {
                arrayList.add(anyValue.toAny());
            }
            return arrayList.toArray(new Object[0]);
        }
        if (!isAnyObject()) {
            throw new Error("AnyValue holds unknown type!");
        }
        Map<String, AnyValue> mapAsAnyObject = asAnyObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap(N.e(mapAsAnyObject.size()));
        Iterator<T> it = mapAsAnyObject.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            linkedHashMap.put(key, ((AnyValue) entry.getValue()).toAny());
        }
        return linkedHashMap;
    }
}
