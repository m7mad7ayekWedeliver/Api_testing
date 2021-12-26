package AuthService;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class GetAllApi {
    private  int counter=0;
    private  int countera=0;

    public GetAllApi(int counter, int countera) {
        this.counter = counter;
        this.countera = countera;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCountera() {
        return countera;
    }

    public void setCountera(int countera) {
        this.countera = countera;
    }

    public static void main(String[] args) throws IOException {
        getApi("get all captain ",
                new URL("https://captain.service.wedeliver-dev.com/api/v1/captain/get_all_captains"));
        getApi("get all teams ",
                new URL("https://captain.service.wedeliver-dev.com/api/v1/team/get_all_teams"));
        getApi("get team by id ",
                new URL("https://captain.service.wedeliver-dev.com/api/v1/team/get_team_by_id?team_id=1"));
        getApi("get abstract all captains",
                new URL("https://captain.service.wedeliver-dev.com/api/v1/captain/get_abstract_all_captains?team_id&search_txt=yaq"));
        getApi("get captain tracking ids",
                new URL("https://captain.service.wedeliver-dev.com/api/v1/captain/get_captain_tracking_ids?captain_id=22&tracking_id=T"));
        getApi("get captain by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/captain/get_captain_by_id?captain_id=22"));
        getApi("get captain status history",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/captain/get_captain_status_history?captain_id=528&from_datetime=2021-08-09 00:00:00&to_datetime=2021-08-09 09:46:00"));
        getApi("get captain path history ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/captain/get_captain_path_history?captain_id=528&from_datetime=2021-08-09 00:00:00&to_datetime=2021-08-09 22:46:00"));
        getApi("get business categories",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_business_categories"));
        getApi("settings - transport type ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/transport_types"));
        getApi("get all entry types",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_all_entry_types"));
        getApi("get currency",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_currency"));
        getApi("get all settings",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_all_settings"));
        getApi("get amazon transport type",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_amazon_transport_types"));
        getApi("get all businesses",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_all_businesses?from_date=2021-01-01&to_date=2021-05-30"));
        getApi("get business by id ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_business_by_id?business_id=1"));
        getApi("get abstract all businesses",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_abstract_all_businesses"));
        getApi("get all businesses branches",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_all_businesses_branches?business_id=3"));
        getApi("get business branch by id ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_business_branch_by_id?business_branch_id=3"));
        getApi("get abstract business branches",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_abstract_business_branches?business_id=3"));
        getApi("get branch default values",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_branch_default_values"));
        getApi("get all customers",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_all_customers?mobile=597"));
        getApi("get all business customer",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_all_business_customers?business_id=1&mobile=567"));
        getApi("get user by ids",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_business_user_by_ids"));
        getApi("get all business users",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_all_business_users"));
        getApi("get all banks",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financial/get_all_banks"));
        getApi("get bank by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financial/get_bank_by_id"));
        getApi("get all bank accounts",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financial/get_all_bank_accounts"));
        getApi("get bank account by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financial/get_bank_account_by_id?bank_account_id=1"));
        getApi("validate iban",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financial/validate_iban?iban=SA8480000293608012016818"));

        getApi("get all cities",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_cities"));

        getApi("get city by id ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_city_by_id"));

        getApi("get all abstract cities",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_abstract_cities"));

        getApi("get all cities with area",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_cities_with_areas"));

        getApi("get area by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_area_by_id"));

        getApi("get all areas",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_areas"));

        getApi("get all abstract areas",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_abstract_areas?search_text=area"));

        getApi("get all abstract supported areas",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_abstract_supported_areas?search_text=بحرة&business_branch_id=436&business_id=2"));

        getApi("get zone by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_zone_by_id"));

        getApi("get all zones",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_zones"));
        getApi("get all zones with areas",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_zones_with_areas"));
        getApi("get all groups",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/pricing/get_all_groups"));
        getApi("get group by id ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/pricing/get_group_by_id?group_id=17"));
        getApi("get all business in group",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/pricing/get_all_businesses_in_group?group_id=1"));
        getApi("get all abstract groups",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/pricing/get_all_abstract_groups"));
        getApi("get all states",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_states"));
        getApi("get state by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_state_by_id?state_id=2"));
        getApi("get address by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_address_by_id?address_id=1"));
        getApi("get all addresses",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_addresses"));
        getApi("get abstract packages sizes",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_abstract_packages_sizes"));
        getApi("get packages sizes",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_packages_sizes"));
        getApi("get package size by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_package_size_by_id"));
        getApi("get delivery slot by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_delivery_slot_by_id?slot_id=2"));
        getApi("get all delivery slots",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_all_delivery_slots"));
        getApi("get active delivery slots for order",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_active_delivery_slots_for_order"));
        getApi("get delivery cost",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_delivery_cost"));
        getApi("get order by id ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_order_by_id?tracking_id=KJ11290534"));
        getApi("get all order adjustments ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_all_order_adjustments?order_id=9"));
        getApi("get all orders",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_all_orders?business_id=3"));
        getApi("get order slip info",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_order_slip_info?tracking_id=KJ11290534"));
        getApi("get order public slip info",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_order_public_slip_info?tracking_id=KJ11290534"));
        getApi("pdf slip",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/KJ11290534/pdf_slip"));
        getApi("get order stats",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_orders_stats?party_id=1&party_type=business"));
        getApi("get tracking id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_tracking_ids?party_id=1&party_type=business&search_text=FJ77"));
        getApi("get abstract failure reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_abstract_failure_reasons"));
        getApi("get reversed order details",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_reversed_order_details?order_id=40"));
        getApi("get order status path history",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_order_status_path_history?tracking_id=KJ11290534&from_datetime=2021-08-09 00:00:00&to_datetime=2021-08-22 22:46:00&order_id=906"));
        getApi("get adjustment reason by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_adjustment_reason_by_id?adjustment_reason_id=1"));
        getApi("get all adjustment reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_all_adjustment_reasons"));
        getApi("get abstract adjustment reasons",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_abstract_adjustment_reasons"));
        getApi("get all journal entries",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_all_journal_entries?party_id=1&party_type=business&from_date=2020-01-01&to_date=2021-01-01"));
        getApi("get wallet stats",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_wallet_stats?party_id=1&party_type=business&from_date=2020-12-22&to_date=2021-01-01"));
        getApi("get transaction",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_transactions?party_type=business&filter_by=approved"));
        getApi("get general party stats",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_general_party_stats?party_type=business"));
        getApi("get reschedule reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1//settings/get_reschedule_reasons"));
        getApi("get abstract reschedule reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_abstract_reschedule_reasons"));
        getApi("get reschedule reason by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_reschedule_reason_by_id?reschedule_reason_id=1"));

        getApi("get cancellation reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1//settings/get_cancellation_reasons"));
        getApi("get abstract cancellation reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_abstract_cancellatione_reasons"));
        getApi("get cancellation reason by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_cancellation_reason_by_id?cancellation_reason_id=1"));

        getApi("get all payment entry types ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_all_payment_entry_types"));
        getApi("get all payment entries  ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_payment_entries?party_id=1&party_type=business&from_date=2020-01-01&to_date=2021-09-01"));
        getApi("get all pending payments  ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_all_pending_payments?party_type=business&from_date=2020-01-01&to_date=2021-09-01"));
        getApi("get all payments ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1//financials/get_all_payments?party_type=business&from_date=2020-01-01&to_date=2021-09-01"));
        getApi("get  payments ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_payments?party_type=business&filter_by=approved"));
        getApi("get integration settings ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_integration_settings"));
        getApi("get warehouse by id ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_warehouse_by_id?warehouse_id=1"));
        getApi("get all warehouses ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_warehouses"));
        getApi("get third parties captains",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/captain/get_third_parties_captains?search_txt=a"));
        getApi("get all warehouse orders",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_all_warehouse_orders?warehouse_id=1"));
        getApi("get dr delivery cost",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_dr_delivery_cost?area_id=6&resources_count=3&pickup_branch_id=1&to_datetime=2021-05-15T19:00:13.104Z&from_datetime=2021-05-15T12:00:13.104Z&business_id=&transport_type_id=2"));
        getApi("get all business dr orders",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_all_business_dr_orders?business_id=1"));
        getApi("get dr order by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/orders/get_dr_order_by_id?order_id=1"));
        getApi("get abstract dr cancellation reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_abstract_dr_cancellation_reasons"));
        getApi("get  dr cancellation reason by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/settings/get_dr_cancellation_reason_by_id?cancellation_reason_id=1"));
        getApi("get all dr cancellation reason",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/settings/get_all_dr_cancellation_reasons"));
        getApi("get all pending  adjustment ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_all_pending_adjustments?party_type=business&from_date=2020-01-01&to_date=2021-09-01"));
        getApi("get all adjustment ",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/financials/get_all_adjustments?party_type=business&from_date=2020-01-01&to_date=2021-09-01"));
        getApi("get RTO fees settings",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_rto_fees_settings"));
        getApi("get cancellation fees setting",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_cancellation_fees_settings"));
        getApi("get statuses triggers",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/settings/get_statuses_triggers"));
        getApi("get override zone by id",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_override_zone_by_id?zone_id=8"));
        getApi("get all override zones",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/location/get_all_override_zones_with_locations"));
        getApi("get country by id",
                new URL("https://businessapis.wedeliverspace.dev/api/v1/location/get_country_by_id?country_id=252"));
        getApi("get all country",
                new URL("https://businessapis.wedeliverspace.dev/api/v1/location/get_all_countries"));
        getApi("get all country with cities",
                new URL("https://businessapis.wedeliverspace.dev/api/v1/location/get_all_countries_with_cities?search_txt=afgh"));
        getApi("get all abstract countries",
                new URL("https://businessapis.wedeliverspace.dev/api/v1/location/get_all_abstract_countries?search_txt=sa"));
        getApi("get all abstract global cities",
                new URL("https://businessapis.wedeliverspace.dev/api/v1/location/get_all_abstract_global_cities?search_txt=villa&country_id="));
        getApi("get billing address",
                new URL("https://expressapis.wedeliverspace.dev/api/v1/business/get_billing_address?business_id=1"));

//        System.out.println("done ="+counter +" ---- "+"fail ="+countera);

    }
    public static void getApi(String api_name, URL url) {
        try {
            System.out.println(api_name);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setRequestMethod("GET");
            http.setRequestProperty("Accept", "application/json");
            http.setRequestProperty("authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoyOTQsImZ1bGxfbmFtZSI6Im1vaGFtZWQiLCJ1c2VyX3R5cGUiOiJBZG1pbmlzdHJhdG9yIiwicm9sZSI6IkFkbWluaXN0cmF0b3IiLCJtb2JpbGUiOiI5NjY1OTI1MzM1MzQiLCJlbWFpbCI6Im1vaGFtbWVkLmhheWVrQHdlZGVsaXZlcmFwcC5jb20iLCJleHAiOjE2Mjg1MjE4NzUsImxhbmd1YWdlIjoiYXIifQ.0dLIY9Kvpld6qbzuQnfeznfVAI163bINawK_E0k3Kik");
            print_input_stream(http.getInputStream());
            if (http.getResponseCode() == 200) {
                System.out.println(api_name + " Status code " + http.getResponseCode() + " " + http.getResponseMessage());
                http.disconnect();
            } else {
                System.out.println(api_name + " fail");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void print_input_stream(InputStream inputStream){
        String text = null;
        try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name())) {
            text = scanner.useDelimiter("\\A").next();
        }
        System.out.println(text);

    }
}


