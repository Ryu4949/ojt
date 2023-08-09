import { createContext, useMemo, useState } from "react";

const orderContext = createContext();

export function OrderContextProvider(props) {

    const [orderCounts, setOrderCounts] = useState({
        products: new Map(),
        options: new Map(),
    })

    const value = useMemo(() => {
        return [{ ...orderCounts }]
        }, [orderCounts]);

    return <OrderContextProvider value={value} {...props} />

}
