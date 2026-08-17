package Zb;

import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.CodedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(kotlin.reflect.o collectionType, kotlin.reflect.o elementType, ReadableType providedType, CodedException cause) {
        this(collectionType, elementType, providedType.name(), cause);
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }

    private a(kotlin.reflect.o oVar, kotlin.reflect.o oVar2, String str, CodedException codedException) {
        super("Cannot cast '" + str + "' to '" + oVar2 + "' required by the collection of type: '" + oVar + "'.", codedException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(kotlin.reflect.o collectionType, kotlin.reflect.o elementType, kotlin.reflect.d providedType, CodedException cause) {
        this(collectionType, elementType, providedType.toString(), cause);
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(providedType, "providedType");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
