package expo.modules.kotlin.views;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements ReadableMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadableMap f41054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f41055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rb.m f41056c;

    public k(ReadableMap backingMap, List filteredKeys) {
        Intrinsics.checkNotNullParameter(backingMap, "backingMap");
        Intrinsics.checkNotNullParameter(filteredKeys, "filteredKeys");
        this.f41054a = backingMap;
        this.f41055b = filteredKeys;
        this.f41056c = new Rb.m(backingMap.getEntryIterator(), new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(k kVar, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !kVar.f41055b.contains(it.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(k kVar, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !kVar.f41055b.contains(it);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Rb.m getEntryIterator() {
        return this.f41056c;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getArray(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getBoolean(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getDouble(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getDynamic(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getInt(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getLong(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMap getMap(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getMap(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getString(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.getType(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.hasKey(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f41054a.isNull(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new l(this.f41054a.keySetIterator(), new i(this));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap toHashMap() {
        return this.f41054a.toHashMap();
    }
}
