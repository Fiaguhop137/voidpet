package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final V.k a(V.k kVar, Function1 function1) {
        return kVar.then(new OnGloballyPositionedElement(function1));
    }
}
