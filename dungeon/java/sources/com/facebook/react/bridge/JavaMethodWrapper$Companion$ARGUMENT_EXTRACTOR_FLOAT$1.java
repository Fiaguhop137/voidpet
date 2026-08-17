package com.facebook.react.bridge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J%\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/react/bridge/JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_FLOAT$1", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "", "extractArgument", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "jsArguments", "Lcom/facebook/react/bridge/ReadableArray;", "atIndex", "", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;I)Ljava/lang/Float;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_FLOAT$1 extends JavaMethodWrapper.ArgumentExtractor<Float> {
    JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_FLOAT$1() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
    public Float extractArgument(JSInstance jsInstance, ReadableArray jsArguments, int atIndex) {
        Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
        Intrinsics.checkNotNullParameter(jsArguments, "jsArguments");
        return Float.valueOf((float) jsArguments.getDouble(atIndex));
    }
}
