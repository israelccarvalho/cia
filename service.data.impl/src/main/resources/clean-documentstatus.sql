delete  from document_data where id not in (select DOCUMENT_DOCUMENT_STATUS_CON_0 from document_status_container);