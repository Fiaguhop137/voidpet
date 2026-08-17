package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/facebook/react/bridge/JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_ARRAY$1", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "Lcom/facebook/react/bridge/ReadableArray;", "extractArgument", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "jsArguments", "atIndex", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_ARRAY$1 extends JavaMethodWrapper.ArgumentExtractor<ReadableArray> {
    JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_ARRAY$1() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
    public ReadableArray extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
        Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
        Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
        return jsArguments.getArray(atIndex);
    }
}
