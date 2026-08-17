package androidx.compose.ui.input.rotary;

import V.k;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final k a(k kVar, Function1 function1) {
        return kVar.then(new RotaryInputElement(function1, null));
    }
}
