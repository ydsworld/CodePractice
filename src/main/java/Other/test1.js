
    function (field, value, path) {
        var pathfield = field.nextSibling().nextSibling().nextSibling().nextSibling();
        var selectionValue = field.getValue();
        var elementes = field.findParentByType('tabpanel');
        d.hideTabStripItem(4);
        debugger;
        if ((selectionValue == 'Icon')) {
            pathfield.setVisible(true);
        } else if (selectionValue == 'dropdown1'){
            pathfield.setVisible(false);
           // elementes.unhideTabStripItem('tab2');
        } else {
            pathfield.setVisible(false);
            //elementes.hideTabStripItem('tab4');
        }
    }



        function(field, value, path){
            var pathfield = field.nextSibling().nextSibling().nextSibling().nextSibling();
            var tabs = field.findParentByType('tabpanel');
            debugger;
            var selectionValue = field.getValue();

            if ((selectionValue == 'Icon')) {
                pathfield.setVisible(true);
            } else if (selectionValue == 'dropdown1') {
                tabs.unhideTabStripItem(3);
            } else if (selectionValue == 'dropdown2') {
                tabs.unhideTabStripItem(4);
            } else {
                pathfield.setVisible(false);
                tabs.hideTabStripItem(3);
                tabs.hideTabStripItem(4);
            }
        }


function(field, value, path){ var pathfield = field.nextSibling().nextSibling().nextSibling().nextSibling(); var selectionValue = field.getValue(); if (selectionValue == 'No Icon'){ pathfield.setVisible(false); } else { pathfield.setVisible(true);} }
