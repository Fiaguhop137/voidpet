package com.facebook.react.devsupport;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.react.AbstractC2235o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2206g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2206g f29681a = new C2206g();

    /* JADX INFO: renamed from: com.facebook.react.devsupport.g$a */
    public interface a {
        void a(String str);
    }

    private C2206g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(EditText editText, String str, View view) {
        editText.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EditText editText, String str, View view) {
        editText.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a aVar, EditText editText, AlertDialog alertDialog, View view) {
        aVar.a(editText.getText().toString());
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AlertDialog alertDialog, View view) {
        alertDialog.dismiss();
    }

    public final void e(Context context, N6.a devSettings, a onClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(devSettings, "devSettings");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        T6.e eVarR = devSettings.r();
        String strB = eVarR.b();
        eVarR.d("");
        String strB2 = eVarR.b();
        eVarR.d(strB);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int i10 = (int) (4 * context.getResources().getDisplayMetrics().density);
        int i11 = (int) (16 * context.getResources().getDisplayMetrics().density);
        linearLayout.setPadding(i11, i11, i11, i11);
        TextView textView = new TextView(context);
        textView.setText(context.getString(AbstractC2235o.f30031f));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        EditText editText = new EditText(context);
        editText.setInputType(1);
        editText.setHint(context.getString(AbstractC2235o.f30030e));
        editText.setBackgroundResource(17301526);
        editText.setHintTextColor(-3355444);
        editText.setTextColor(-16777216);
        editText.setText(strB);
        Button button = new Button(context);
        button.setText(strB2);
        button.setTextSize(12.0f);
        button.setAllCaps(false);
        button.setOnClickListener(new ViewOnClickListenerC2202c(editText, strB2));
        String strC = com.facebook.react.modules.systeminfo.a.f29982a.c(context);
        Button button2 = new Button(context);
        button2.setText(strC);
        button2.setTextSize(12.0f);
        button2.setAllCaps(false);
        button2.setOnClickListener(new ViewOnClickListenerC2203d(editText, strC));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.addView(button);
        linearLayout2.addView(button2);
        TextView textView2 = new TextView(context);
        textView2.setText(context.getString(AbstractC2235o.f30032g, com.facebook.react.modules.systeminfo.a.b(context)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10, 0, i11);
        textView2.setLayoutParams(layoutParams);
        Button button3 = new Button(context);
        button3.setText(context.getString(AbstractC2235o.f30028c));
        Button button4 = new Button(context);
        button4.setText(context.getString(AbstractC2235o.f30029d));
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(textView2);
        linearLayout.addView(button3);
        linearLayout.addView(button4);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setTitle(context.getString(AbstractC2235o.f30027b)).setView(linearLayout).create();
        button3.setOnClickListener(new ViewOnClickListenerC2204e(onClickListener, editText, alertDialogCreate));
        button4.setOnClickListener(new ViewOnClickListenerC2205f(alertDialogCreate));
        alertDialogCreate.show();
    }
}
