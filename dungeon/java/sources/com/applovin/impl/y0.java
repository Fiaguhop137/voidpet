package com.applovin.impl;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p184k4.G0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f28410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x0 f28411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f28412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f28413d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListView f28415f;

    @Override // com.applovin.impl.o0
    public final p a() {
        return this.f28410a;
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            v0 v0Var = (v0) list.get(i10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = v0Var.f28383e;
            boolean zIsValidString = StringUtils.isValidString(str);
            if (this.f28413d.contains(Integer.valueOf(i10))) {
                Map map = v0Var.f28380b;
                Map map2 = v0Var.f28381c;
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("PARAMETERS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(!map.isEmpty() ? JsonUtils.maybeConvertToIndentedString(new JSONObject(map)) : "None", -16777216));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nOPTIONS: ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(map2.isEmpty() ? "None" : JsonUtils.maybeConvertToIndentedString(new JSONObject(map2)), -16777216));
                HashMap map3 = v0Var.f28382d;
                if (map3 != null && !map3.isEmpty()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nUSER DATA: ", -7829368));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(JsonUtils.maybeConvertToIndentedString(new JSONObject(map3)), -16777216));
                }
                if (zIsValidString) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("\nERROR: ", -65536));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(str, -65536));
                }
            }
            k1 k1Var = new k1(4);
            k1Var.f28090c = StringUtils.createSpannedString(v0Var.f28379a, -16777216, 18, 1);
            k1Var.f28091d = new SpannedString(spannableStringBuilder);
            k1Var.f28092e = zIsValidString ? R.drawable.axon_ic_x_mark : R.drawable.axon_ic_check_mark_bordered;
            k1Var.f28093f = getColor(zIsValidString ? R.color.axon_sdk_xmarkColor : R.color.axon_sdk_checkmarkColor);
            k1Var.f28089b = true;
            arrayList.add(new l1(k1Var));
        }
        return arrayList;
    }

    public final void a(ArrayList arrayList, p pVar) {
        this.f28410a = pVar;
        this.f28412c = a(arrayList);
        x0 x0Var = new x0(this, this);
        this.f28411b = x0Var;
        x0Var.f28228d = new G0(this, arrayList);
        this.f28411b.notifyDataSetChanged();
    }

    public final void a(List list, h1 h1Var, l1 l1Var) {
        int i10 = h1Var.f28054b;
        if (this.f28413d.contains(Integer.valueOf(i10))) {
            this.f28413d.remove(Integer.valueOf(i10));
        } else {
            this.f28413d.add(Integer.valueOf(i10));
        }
        this.f28412c = a(list);
        this.f28411b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.o0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Events");
        setContentView(R.layout.debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f28415f = listView;
        listView.setAdapter((ListAdapter) this.f28411b);
        TextView textView = new TextView(this);
        this.f28414e = textView;
        textView.setGravity(17);
        this.f28414e.setTextSize(18.0f);
        this.f28414e.setText(R.string.debugger_no_events_text);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.default_margin);
        this.f28414e.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        ((FrameLayout) findViewById(16908290)).addView(this.f28414e, new FrameLayout.LayoutParams(-1, -1, 17));
        if (this.f28412c.isEmpty()) {
            this.f28414e.setVisibility(0);
            this.f28415f.setVisibility(8);
        } else {
            this.f28414e.setVisibility(8);
            this.f28415f.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.events_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_clear) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f28410a.getEventService().a();
        this.f28412c.clear();
        this.f28411b.notifyDataSetChanged();
        if (this.f28412c.isEmpty()) {
            this.f28414e.setVisibility(0);
            this.f28415f.setVisibility(8);
            return true;
        }
        this.f28414e.setVisibility(8);
        this.f28415f.setVisibility(0);
        return true;
    }
}
